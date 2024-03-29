package net.serg.kafkaavrobasics.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserRequest {
    private String name;
    private Integer id;
    private Integer favoriteNumber;
    private String favoriteColor;
}
