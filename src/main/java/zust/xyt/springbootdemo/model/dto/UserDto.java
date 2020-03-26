package zust.xyt.springbootdemo.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author AndrewElvis
 * @date 2020-03-23-15:25
 */
@Data
@AllArgsConstructor
@ApiModel("用户")
public class UserDto {
    @ApiModelProperty("用户ID")
    private Integer id;
    @ApiModelProperty("用户名称")
    private String name;
}
