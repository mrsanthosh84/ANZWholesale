package com.test;

import com.test.model.AccountListEnquiry;
import com.test.model.AccountTransactionEnquiry;
import com.test.repository.AccountTransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.test.repository.AccountListRepository;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by smanicka on 3/4/19.
 */
@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private AccountListRepository accountListRepository;

    @Autowired
    private AccountTransactionRepository accountTransactionRepository;

    private static final String DDMMYYYY = "dd/MM/yyyy";
    private static final String MMMDDYYYY = "MMM dd, yyyy";

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /**
     * View all account List
     * @return List<AccountListEnquiry>
     */
    public List<AccountListEnquiry> viewAccountList() {
        return accountListRepository.findAll();
    }

    /**
     * View account transaction based on given account nummber
     * @return
     */
    public List<AccountListEnquiry> viewAccountTransactionByAccountNumber(String accountNumber) {
        return accountListRepository.findAccountTransactionByAccountNumber(Integer.valueOf(accountNumber));
    }

    /**
     * View all account transaction
     * @return List<AccountTransactionEnquiry>
     */
    public List<AccountTransactionEnquiry> viewAccountTransaction() {
        return accountTransactionRepository.findAll();
    }

    @Override
    public void run(String... args) throws Exception {

        accountListRepository.deleteAll();
        accountTransactionRepository.deleteAll();

        // save a couple of AccountListEnquiry
        accountListRepository.save(new AccountListEnquiry(585309209, "SGSavings726", "Savings", new SimpleDateFormat(DDMMYYYY).parse("08/11/2018"), "SGD", new BigDecimal(84327.51),
                Arrays.asList(new AccountTransactionEnquiry("123-2223-212", "Current Account", new SimpleDateFormat("MMM dd, yyyy").parse("Jan 12, 2012"), "SGD", BigDecimal.ZERO, new BigDecimal("9540.98"), "Credit", ""),
                new AccountTransactionEnquiry("123-2223-212", "Current Account",new SimpleDateFormat("MMM dd, yyyy").parse("Jan 12, 2012"), "SGD", BigDecimal.ZERO, new BigDecimal("7497.82"), "Credit", ""))

        ));
        accountListRepository.save(new AccountListEnquiry(791066619, "AUSavings933", "Savings", new SimpleDateFormat(DDMMYYYY).parse("08/11/2018"), "AUD", new BigDecimal(88005.93),
                Arrays.asList(new AccountTransactionEnquiry("123-2223-212", "Current Account", new SimpleDateFormat("MMM dd, yyyy").parse("Jan 12, 2012"), "SGD", BigDecimal.ZERO, new BigDecimal("5564.79"), "Credit", ""),
                        new AccountTransactionEnquiry("123-2223-212", "Current Account",new SimpleDateFormat("MMM dd, yyyy").parse("Jan 12, 2012"), "SGD", BigDecimal.ZERO, new BigDecimal("8136.18"), "Credit", ""))
                ));
        accountListRepository.save(new AccountListEnquiry(321143048, "AUCurrent433", "Current", new SimpleDateFormat(DDMMYYYY).parse("08/11/2018"), "AUD", new BigDecimal(38010.62),
                Arrays.asList(new AccountTransactionEnquiry("123-2223-212", "Current Account", new SimpleDateFormat("MMM dd, yyyy").parse("Jan 12, 2012"), "SGD", BigDecimal.ZERO, new BigDecimal("9442.46"), "Credit", ""))
                ));
        accountListRepository.save(new AccountListEnquiry(347786244, "SGCurrent166", "Current", new SimpleDateFormat(DDMMYYYY).parse("08/11/2018"), "SGD", new BigDecimal(50664.65),
                Arrays.asList(new AccountTransactionEnquiry("123-2223-212", "Current Account", new SimpleDateFormat("MMM dd, yyyy").parse("Jan 12, 2012"), "SGD", BigDecimal.ZERO, new BigDecimal("7614.45"), "Credit", ""))
        ));
        accountListRepository.save(new AccountListEnquiry(680168913, "AUCurrent374", "Current", new SimpleDateFormat(DDMMYYYY).parse("08/11/2018"), "AUD", new BigDecimal(41327.28), new ArrayList<AccountTransactionEnquiry>()));
        accountListRepository.save(new AccountListEnquiry(136056165, "AUSavings938", "Savings", new SimpleDateFormat(DDMMYYYY).parse("08/11/2018"), "AUD", new BigDecimal(48928.79), new ArrayList<AccountTransactionEnquiry>()));
        accountListRepository.save(new AccountListEnquiry(453963528, "SGSavings842", "Savings", new SimpleDateFormat(DDMMYYYY).parse("08/11/2018"), "SGD", new BigDecimal(72117.53), new ArrayList<AccountTransactionEnquiry>()));
        accountListRepository.save(new AccountListEnquiry(334666982, "AUSavings253", "Savings", new SimpleDateFormat(DDMMYYYY).parse("08/11/2018"), "AUD", new BigDecimal(20588.16), new ArrayList<AccountTransactionEnquiry>()));
        accountListRepository.save(new AccountListEnquiry(793949180, "AUCurrent754", "Current", new SimpleDateFormat(DDMMYYYY).parse("08/11/2018"), "AUD", new BigDecimal(88794.48), new ArrayList<AccountTransactionEnquiry>()));
        accountListRepository.save(new AccountListEnquiry(768759901, "SGCurrent294", "Current", new SimpleDateFormat(DDMMYYYY).parse("08/11/2018"), "SGD", new BigDecimal(5906.55), new ArrayList<AccountTransactionEnquiry>()));
        accountListRepository.save(new AccountListEnquiry(847257972, "AUCurrent591", "Current", new SimpleDateFormat(DDMMYYYY).parse("08/11/2018"), "AUD", new BigDecimal(92561.68), new ArrayList<AccountTransactionEnquiry>()));


        accountTransactionRepository.save(new AccountTransactionEnquiry("123-2223-212", "Current Account", new SimpleDateFormat(MMMDDYYYY).parse("Jan 12, 2012"), "SGD", BigDecimal.ZERO, new BigDecimal("9540.98"), "Credit", ""));
        accountTransactionRepository.save(new AccountTransactionEnquiry("123-2223-212", "Current Account",new SimpleDateFormat(MMMDDYYYY).parse("Jan 12, 2012"), "SGD", BigDecimal.ZERO, new BigDecimal("7497.82"), "Credit", ""));
        accountTransactionRepository.save(new AccountTransactionEnquiry("123-2223-212", "Current Account",new SimpleDateFormat(MMMDDYYYY).parse("Jan 12, 2012"), "SGD", BigDecimal.ZERO, new BigDecimal("5564.79"), "Credit", ""));
        accountTransactionRepository.save(new AccountTransactionEnquiry("123-2223-212", "Current Account",new SimpleDateFormat(MMMDDYYYY).parse("Jan 12, 2012"), "SGD", BigDecimal.ZERO, new BigDecimal("8136.18"), "Credit", ""));
        accountTransactionRepository.save(new AccountTransactionEnquiry("123-2223-212", "Current Account",new SimpleDateFormat(MMMDDYYYY).parse("Jan 12, 2012"), "SGD", BigDecimal.ZERO, new BigDecimal("9442.46"), "Credit", ""));
        accountTransactionRepository.save(new AccountTransactionEnquiry("123-2223-212", "Current Account",new SimpleDateFormat(MMMDDYYYY).parse("Jan 12, 2012"), "SGD", BigDecimal.ZERO, new BigDecimal("7614.45"), "Credit", ""));
        accountTransactionRepository.save(new AccountTransactionEnquiry("123-2223-212", "Current Account",new SimpleDateFormat(MMMDDYYYY).parse("Jan 12, 2012"), "SGD", BigDecimal.ZERO, new BigDecimal("3311.55"), "Credit", ""));
        accountTransactionRepository.save(new AccountTransactionEnquiry("123-2223-212", "Current Account",new SimpleDateFormat(MMMDDYYYY).parse("Jan 12, 2012"), "SGD", BigDecimal.ZERO, new BigDecimal("9186.09"), "Credit", ""));
        accountTransactionRepository.save(new AccountTransactionEnquiry("123-2223-212", "Current Account",new SimpleDateFormat(MMMDDYYYY).parse("Jan 12, 2012"), "SGD", BigDecimal.ZERO, new BigDecimal("1905.86"), "Credit", ""));
        accountTransactionRepository.save(new AccountTransactionEnquiry("123-2223-212", "Current Account",new SimpleDateFormat(MMMDDYYYY).parse("Jan 12, 2012"), "SGD", BigDecimal.ZERO, new BigDecimal("197.78"), "Credit", ""));
        accountTransactionRepository.save(new AccountTransactionEnquiry("123-2223-212", "Current Account",new SimpleDateFormat(MMMDDYYYY).parse("Jan 12, 2012"), "SGD", BigDecimal.ZERO, new BigDecimal("8430.49"), "Credit", ""));
        accountTransactionRepository.save(new AccountTransactionEnquiry("123-2223-212", "Current Account",new SimpleDateFormat(MMMDDYYYY).parse("Jan 12, 2012"), "SGD", BigDecimal.ZERO, new BigDecimal("8.33"), "Credit", ""));

    }

}
