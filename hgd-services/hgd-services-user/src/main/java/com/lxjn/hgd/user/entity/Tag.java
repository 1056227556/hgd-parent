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
@TableName("tb_tag")
public class Tag extends Model<Tag> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "tid", type = IdType.AUTO)
    private Integer tid;

    private String tagname;

    private String gid;


    @Override
    protected Serializable pkVal() {
        return this.tid;
    }

}
