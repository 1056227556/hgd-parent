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
@TableName("tb_sort")
public class Sort extends Model<Sort> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "sid", type = IdType.AUTO)
    private Integer sid;

    private String sortname;

    private String alias;

    private Integer taxis;

    private Integer pid;

    private String description;

    private String template;


    @Override
    protected Serializable pkVal() {
        return this.sid;
    }

}
