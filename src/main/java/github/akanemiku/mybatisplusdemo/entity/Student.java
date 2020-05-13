package github.akanemiku.mybatisplusdemo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Student implements Serializable {
    @TableId(type = IdType.AUTO)
    private Integer studentId;

    private String studentNo;

    private String name;

    private String college;

    private Date time;
}
