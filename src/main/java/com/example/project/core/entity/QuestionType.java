package com.example.project.core.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName question_type
 */
@TableName(value ="question_type")
@Data
public class QuestionType implements Serializable {
    /**
     * 题目类型ID
     */
    @TableId(type = IdType.AUTO)
    private Integer questionTypeId;

    /**
     * 题目类型名称
     */
    private String questionTypeName;

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
        QuestionType other = (QuestionType) that;
        return (this.getQuestionTypeId() == null ? other.getQuestionTypeId() == null : this.getQuestionTypeId().equals(other.getQuestionTypeId()))
            && (this.getQuestionTypeName() == null ? other.getQuestionTypeName() == null : this.getQuestionTypeName().equals(other.getQuestionTypeName()))
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
        result = prime * result + ((getQuestionTypeId() == null) ? 0 : getQuestionTypeId().hashCode());
        result = prime * result + ((getQuestionTypeName() == null) ? 0 : getQuestionTypeName().hashCode());
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
        sb.append(", questionTypeId=").append(questionTypeId);
        sb.append(", questionTypeName=").append(questionTypeName);
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