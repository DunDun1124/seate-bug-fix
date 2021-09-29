package seata.fix.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author jiangqiang
 * @date 2021/7/22 14:26
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CheckOrder {
    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Integer checkOrderId;

    /**
     * 关联的盘点id
     */
    private Integer checkId;

    /**
     * 订单id
     */
    private Integer stockOrderId;

    /**
     * 订单号
     */
    private String stockOrderNumber;

    /**
     * 盘点商品数量
     */
    private Integer checkCount;

    /**
     * 盘点状态
     */
    private Integer checkStatus;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建人
     */
    private Integer createBy;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 更新人
     */
    private Integer updateBy;

    /**
     * 逻辑删除标识
     */
    private Integer deleted;
}