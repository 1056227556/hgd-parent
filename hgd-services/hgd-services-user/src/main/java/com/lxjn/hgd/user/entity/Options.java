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
@TableName("tb_options")
public class Options extends Model<Options> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "option_id", type = IdType.AUTO)
    private Integer optionId;

    private String optionName;

    private String optionValue;


    @Override
    protected Serializable pkVal() {
        return this.optionId;
    }

}
