package com.generalbytes.batm.server.extensions.extra.ethereum.erc20.bizzcoin;

import com.generalbytes.batm.common.currencies.CryptoCurrency;
import com.generalbytes.batm.server.extensions.CryptoCurrencyDefinition;
import com.generalbytes.batm.server.extensions.payment.IPaymentSupport;

public class BizzcoinDefinition extends CryptoCurrencyDefinition{
    private IPaymentSupport paymentSupport = new BizzcoinPaymentSupport();

    public BizzcoinDefinition() {
        super(CryptoCurrency.BIZZCOIN.getCode(), "BIZZ ERC20 Token", "ethereum","https://bizzcoin.com/");
    }

    @Override
    public IPaymentSupport getPaymentSupport() {
        return paymentSupport;
    }
}
