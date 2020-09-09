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
@TableName("tb_comment")
public class Comment extends Model<Comment> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "cid", type = IdType.AUTO)
    private Integer cid;

    private Integer gid;

    private Integer pid;

    private Long date;

    private String poster;

    private String comment;

    private String mail;

    private String url;

    private String ip;

    private String hide;


    @Override
    protected Serializable pkVal() {
        return this.cid;
    }

}
