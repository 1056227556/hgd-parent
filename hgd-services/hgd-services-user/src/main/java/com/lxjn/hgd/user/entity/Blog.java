package com.lxjn.hgd.user.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author lxjn
 * @since 2020-09-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("tb_blog")
public class Blog extends Model<Blog> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "gid", type = IdType.AUTO)
    private Integer gid;

    private String title;

    private Long date;

    private String content;

    private String excerpt;

    private String alias;

    private Integer author;

    private Integer sortid;

    private String type;

    private Integer views;

    private Integer comnum;

    private Integer attnum;

    private String top;

    private String sortop;

    private String hide;

    private String checked;

    private String allowRemark;

    private String password;

    private String template;

    private String tags;


    @Override
    protected Serializable pkVal() {
        return this.gid;
    }

}
