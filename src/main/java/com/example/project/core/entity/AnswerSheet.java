package com.example.project.core.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName answer_sheet
 */
@TableName(value ="answer_sheet")
@Data
public class AnswerSheet implements Serializable {
    /**
     * 自增ID
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 学号
     */
    private Integer studentCode;

    /**
     * 套卷ID
     */
    private Integer paperId;

    /**
     * 题号
     */
    private Integer questionNumber;

    /**
     * 答题答案
     */
    private String answer;

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
        AnswerSheet other = (AnswerSheet) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getStudentCode() == null ? other.getStudentCode() == null : this.getStudentCode().equals(other.getStudentCode()))
            && (this.getPaperId() == null ? other.getPaperId() == null : this.getPaperId().equals(other.getPaperId()))
            && (this.getQuestionNumber() == null ? other.getQuestionNumber() == null : this.getQuestionNumber().equals(other.getQuestionNumber()))
            && (this.getAnswer() == null ? other.getAnswer() == null : this.getAnswer().equals(other.getAnswer()))
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
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getStudentCode() == null) ? 0 : getStudentCode().hashCode());
        result = prime * result + ((getPaperId() == null) ? 0 : getPaperId().hashCode());
        result = prime * result + ((getQuestionNumber() == null) ? 0 : getQuestionNumber().hashCode());
        result = prime * result + ((getAnswer() == null) ? 0 : getAnswer().hashCode());
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
        sb.append(", id=").append(id);
        sb.append(", studentCode=").append(studentCode);
        sb.append(", paperId=").append(paperId);
        sb.append(", questionNumber=").append(questionNumber);
        sb.append(", answer=").append(answer);
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