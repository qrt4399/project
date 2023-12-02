package com.example.project.core.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName question
 */
@TableName(value ="question")
@Data
public class Question implements Serializable {
    /**
     * 题目ID
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 套卷ID
     */
    private Integer paperId;

    /**
     * 题目类型ID
     */
    private Integer questionTypeId;

    /**
     * 题号
     */
    private Integer questionNumber;

    /**
     * 题目
     */
    private String question;

    /**
     * 答案
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
        Question other = (Question) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPaperId() == null ? other.getPaperId() == null : this.getPaperId().equals(other.getPaperId()))
            && (this.getQuestionTypeId() == null ? other.getQuestionTypeId() == null : this.getQuestionTypeId().equals(other.getQuestionTypeId()))
            && (this.getQuestionNumber() == null ? other.getQuestionNumber() == null : this.getQuestionNumber().equals(other.getQuestionNumber()))
            && (this.getQuestion() == null ? other.getQuestion() == null : this.getQuestion().equals(other.getQuestion()))
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
        result = prime * result + ((getPaperId() == null) ? 0 : getPaperId().hashCode());
        result = prime * result + ((getQuestionTypeId() == null) ? 0 : getQuestionTypeId().hashCode());
        result = prime * result + ((getQuestionNumber() == null) ? 0 : getQuestionNumber().hashCode());
        result = prime * result + ((getQuestion() == null) ? 0 : getQuestion().hashCode());
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
        sb.append(", paperId=").append(paperId);
        sb.append(", questionTypeId=").append(questionTypeId);
        sb.append(", questionNumber=").append(questionNumber);
        sb.append(", question=").append(question);
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