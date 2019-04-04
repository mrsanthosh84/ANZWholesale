package com.test;

import com.test.model.AccountListEnquiry;
import com.test.model.AccountTransactionEnquiry;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cglib.core.CollectionUtils;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertTrue;
/**
 * Created by smanicka on 4/4/19.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class ApplicationTest {
    @Autowired
    private Application application;

    @Test
    public void whenDataIsPresentedInAccountListThenViewAllAccountListEnquiry() {
        assertTrue(!application.viewAccountList().isEmpty() && application.viewAccountList().size()>0);
    }

    @Test
    public void whenDataIsPresentedInAccountTransactionThenViewAllAccountTransactionEnquiry() {
        assertTrue(!application.viewAccountTransaction().isEmpty() && application.viewAccountTransaction().size()>0);
    }

    @Test
    public void whenDataIsPresentedInAccountTransactionThenViewAccountTransactionBasedOnAccountNumber() {
        List<AccountListEnquiry> accountListEnquiryList = application.viewAccountTransactionByAccountNumber("585309209");
        assertTrue(!accountListEnquiryList.isEmpty());
        if(!accountListEnquiryList.isEmpty()) {
            accountListEnquiryList.forEach(accountListEnquiry -> assertTrue(accountListEnquiry.getAccountTransactionEnquiries().size() == 2));
        }
    }

    @Test
    public void whenDataIsNotPresentedInAccountTransactionThenViewAccountTransactionBasedOnAccountNumber() {
        List<AccountListEnquiry> accountListEnquiryList = application.viewAccountTransactionByAccountNumber("768759901");
        assertTrue(!accountListEnquiryList.isEmpty());
        if(!accountListEnquiryList.isEmpty()) {
            accountListEnquiryList.forEach(accountListEnquiry -> assertTrue(accountListEnquiry.getAccountTransactionEnquiries().size() == 0));
        }
    }
}