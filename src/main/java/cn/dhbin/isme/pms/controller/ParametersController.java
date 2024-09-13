package cn.dhbin.isme.pms.controller;


import cn.dhbin.isme.common.auth.RoleType;
import cn.dhbin.isme.common.auth.Roles;
import cn.dhbin.isme.common.preview.Preview;
import cn.dhbin.isme.common.response.R;
import cn.dhbin.isme.pms.domain.request.*;


import cn.dhbin.isme.pms.service.ParametersService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * 用户Controller
 *
 * @author dhb
 */
@RestController
@RequestMapping("/parameters")
@RequiredArgsConstructor
@Tag(name = "系统参数")
public class ParametersController {

    private final ParametersService parametersService;

    /**
     * 新建用户
     *
     * @return R
     */
    @PostMapping
//    @Roles({RoleType.SUPER_ADMIN})
    @Preview
    @Operation(summary = "新增系统参数")
    public R<Void> create(@RequestBody @Validated AddParameterRequest request) {
        parametersService.addParameter(request);
        return R.ok();
    }

}
