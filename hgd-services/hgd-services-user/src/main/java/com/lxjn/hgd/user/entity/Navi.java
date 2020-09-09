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
@TableName("tb_navi")
public class Navi extends Model<Navi> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String naviname;

    private String url;

    private String newtab;

    private String hide;

    private Integer taxis;

    private Integer pid;

    private String isdefault;

    private Integer type;

    private Integer typeId;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
