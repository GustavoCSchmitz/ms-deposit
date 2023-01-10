package br.com.deposit.service;

import br.com.deposit.api.form.DepositForm;
import br.com.deposit.dto.DepositResponseDto;
import br.com.deposit.dto.WalletResponseDto;
import br.com.deposit.enums.Status;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Slf4j
@Service
@RequiredArgsConstructor
public class DepositService {

    private final WalletService walletService;

    public DepositResponseDto deposit(DepositForm depositForm){
        WalletResponseDto walletDto = walletService.deposit(depositForm);
        return new DepositResponseDto(Status.CONFIRMED, walletDto.id(), LocalDateTime.now());
    }
}
