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
@TableName("tb_tpl_options_data")
public class TplOptionsData extends Model<TplOptionsData> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String template;

    private String name;

    private String depend;

    private String data;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
