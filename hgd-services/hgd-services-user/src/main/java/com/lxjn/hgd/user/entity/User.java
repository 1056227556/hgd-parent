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
@TableName("tb_user")
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "uid", type = IdType.AUTO)
    private Integer uid;

    private String username;

    private String password;

    private String nickname;

    private String role;

    private String ischeck;

    private String photo;

    private String email;

    private String description;


    @Override
    protected Serializable pkVal() {
        return this.uid;
    }

}
