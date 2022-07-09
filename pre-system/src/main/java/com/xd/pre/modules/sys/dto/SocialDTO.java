package com.xd.pre.modules.sys.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.beans.factory.annotation.Value;

import java.time.LocalDateTime;

/**
 * @Classname DictDTO
 * @Description 社交账号dto
 * @Author 李号东 lihaodongmail@163.com
 * @Date 2019-06-02 09:36
 * @Version 1.0
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SocialDTO {

    private String providerId;

    private String providerUserId;

    private String displayName;

    private String userName;

    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;

}
