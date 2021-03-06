package github.akanemiku.mybatisplusdemo.dao;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import github.akanemiku.mybatisplusdemo.entity.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentMapper extends BaseMapper<Student> {
    /**
     * 自定义分页方法，查找所有学生
     * @param page
     * @param wrapper
     * @return
     */
    IPage<Student> findAll(Page<Student> page, @Param(Constants.WRAPPER) Wrapper<Student> wrapper);
}
