package github.akanemiku.mybatisplusdemo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import github.akanemiku.mybatisplusdemo.entity.Paper;
import org.springframework.stereotype.Repository;

@Repository
public interface PaperMapper extends BaseMapper<Paper> {

}
