package seata.fix.controller;

import io.seata.spring.annotation.GlobalTransactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import seata.fix.entity.CheckOrder;
import seata.fix.mapper.CheckOrderMapper;

/**
 * @author jiangqiang
 * @date 2021/9/29 9:26
 */
@Slf4j
@RestController
@RequiredArgsConstructor
public class IdEmptyController {

    private final CheckOrderMapper checkOrderMapper;

    @GetMapping(value = "/insert")
    public void insertData() {
        final CheckOrder build = CheckOrder.builder().checkId(1).checkCount(1).checkStatus(1).stockOrderId(1).build();
        int insert = checkOrderMapper.insert(build);
        log.info("主键id为{}", build.getCheckOrderId());
    }

    @GetMapping(value = "/seata/insert")
    @GlobalTransactional
    public void insertSeataData() {
        final CheckOrder build = CheckOrder.builder().checkId(1).checkCount(1).checkStatus(1).stockOrderId(1).build();
        int insert = checkOrderMapper.insert(build);
        log.info("主键id为{}", build.getCheckOrderId());
    }

}
