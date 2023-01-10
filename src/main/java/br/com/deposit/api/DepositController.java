package br.com.deposit.api;

import br.com.deposit.api.contract.DepositApi;
import br.com.deposit.api.form.DepositForm;
import br.com.deposit.dto.DepositResponseDto;
import br.com.deposit.service.DepositService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Slf4j
@RestController
@RequiredArgsConstructor
public class DepositController implements DepositApi {

    private final DepositService depositService;

    @Override
    public DepositResponseDto deposit(@Valid DepositForm depositForm) {
        log.info("[DEPOSIT - API] Creating deposit");
        return depositService.deposit(depositForm);
    }
}
