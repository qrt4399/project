package com.example.project.core.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName paper
 */
@TableName(value ="paper")
@Data
public class Paper implements Serializable {
    /**
     * 套卷ID
     */
    @TableId(type = IdType.AUTO)
    private Integer paperId;

    /**
     * 套卷名称
     */
    private String paperName;

    /**
     * 教师编号
     */
    private Integer teacherCode;

    /**
     * 有效状态 1-有效，0-无效，默认1
     */
    private Integer validStatus;

    /**
     * 操作者代码
     */
    private String operatorCode;

    /**
     * 更新者代码
     */
    private String updateCode;

    /**
     * 创建日期
     */
    @TableField(fill = FieldFill.INSERT)
    private Date createDate;

    /**
     * 更新日期
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateDate;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Paper other = (Paper) that;
        return (this.getPaperId() == null ? other.getPaperId() == null : this.getPaperId().equals(other.getPaperId()))
            && (this.getPaperName() == null ? other.getPaperName() == null : this.getPaperName().equals(other.getPaperName()))
            && (this.getTeacherCode() == null ? other.getTeacherCode() == null : this.getTeacherCode().equals(other.getTeacherCode()))
            && (this.getValidStatus() == null ? other.getValidStatus() == null : this.getValidStatus().equals(other.getValidStatus()))
            && (this.getOperatorCode() == null ? other.getOperatorCode() == null : this.getOperatorCode().equals(other.getOperatorCode()))
            && (this.getUpdateCode() == null ? other.getUpdateCode() == null : this.getUpdateCode().equals(other.getUpdateCode()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPaperId() == null) ? 0 : getPaperId().hashCode());
        result = prime * result + ((getPaperName() == null) ? 0 : getPaperName().hashCode());
        result = prime * result + ((getTeacherCode() == null) ? 0 : getTeacherCode().hashCode());
        result = prime * result + ((getValidStatus() == null) ? 0 : getValidStatus().hashCode());
        result = prime * result + ((getOperatorCode() == null) ? 0 : getOperatorCode().hashCode());
        result = prime * result + ((getUpdateCode() == null) ? 0 : getUpdateCode().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", paperId=").append(paperId);
        sb.append(", paperName=").append(paperName);
        sb.append(", teacherCode=").append(teacherCode);
        sb.append(", validStatus=").append(validStatus);
        sb.append(", operatorCode=").append(operatorCode);
        sb.append(", updateCode=").append(updateCode);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}