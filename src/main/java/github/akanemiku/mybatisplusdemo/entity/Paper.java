package github.akanemiku.mybatisplusdemo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

@Data
public class Paper implements Serializable {
    @TableId(type = IdType.AUTO)
    private Integer paperId;

    private String title;

    private String form;

    private String time;

    private Integer studentId;
}
