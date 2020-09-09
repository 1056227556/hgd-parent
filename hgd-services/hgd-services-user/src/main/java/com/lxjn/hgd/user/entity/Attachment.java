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
@TableName("tb_attachment")
public class Attachment extends Model<Attachment> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "aid", type = IdType.AUTO)
    private Integer aid;

    private Integer blogid;

    private String filename;

    private Integer filesize;

    private String filepath;

    private Long addtime;

    private Integer width;

    private Integer height;

    private String mimetype;

    private Integer thumfor;


    @Override
    protected Serializable pkVal() {
        return this.aid;
    }

}
