package com.jing.gmall.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@ApiModel
@Data
public class PageInfoVo implements Serializable {
    @ApiModelProperty("总记录数")
    private long total;
    @ApiModelProperty("总页码")
    private long totalPage;
    @ApiModelProperty("每页显示记录数")
    private long pageSize;
    @ApiModelProperty("分页查出的数据")
    private List<? extends Object> list;
    @ApiModelProperty("当前页码")
    private Integer pageNum;
}
