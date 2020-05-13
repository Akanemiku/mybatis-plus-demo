package github.akanemiku.mybatisplusdemo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Student implements Serializable {
    /**
     * 学生id(数据库自增)
     */
    @TableId(type = IdType.AUTO)
    private Integer studentId;

    /**
     * 学号
     */
    private String studentNo;

    /**
     * 姓名
     */
    private String name;

    /**
     * 所属学院
     */
    private String college;

    /**
     * 修改时间
     */
    private Date time;
}
