package cn.ekgc.addrbook.transport.impl;

import cn.ekgc.addrbook.transport.UserTransport;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("userTransportImpl")
@RequestMapping("/user/trans")
public class UserTransportImpl implements UserTransport {
}
