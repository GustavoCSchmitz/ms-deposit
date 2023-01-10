package br.com.deposit.service;

import br.com.deposit.api.form.DepositForm;
import br.com.deposit.client.WalletClient;
import br.com.deposit.dto.WalletResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
@RequiredArgsConstructor
public class WalletService {

    private final WalletClient walletClient;

    public WalletResponseDto deposit(DepositForm depositForm){
        return depositWalletByClient(depositForm);
    }

    private WalletResponseDto depositWalletByClient(DepositForm depositForm) {
        return walletClient.deposit(depositForm)
                .blockOptional()
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Wallet not found"));
    }
}
