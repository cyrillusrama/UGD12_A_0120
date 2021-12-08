package com.example.ugd12_a_0120.UnitTesting;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class RandomPresenterTest0120 {
    @Mock
    private RandomView view;
    @Mock
    private RandomService service;
    private RandomPresenter presenter;


    @Before
    public void setUp() throws Exception {
        presenter = new RandomPresenter(view, service);
    }

    @Test
    public void shouldShowErrorMessageWhenEmailIsEmpty() throws
            Exception {
        when(view.getEmail()).thenReturn("");
        System.out.println("Testing Pertama: Inputan Email Kosong");
                System.out.println("Email : " + view.getEmail());
        presenter.onRandomClicked();
        verify(view).showEmailError("Email tidak boleh kosong");
    }
    @Test
    public void shouldShowErrorMessageWhenEmailIsNotEmail() throws
            Exception {
        System.out.println( "\n\n" + "Testing Kedua: Inputan email tidak sesuai format");
                when(view.getEmail()).thenReturn("aasss");
        System.out.println("Email : "+view.getEmail());
        presenter.onRandomClicked();
        verify(view).showEmailError("Atribut email tidak sesuai format");
    }
    @Test
    public void shouldShowErrorMessageWhenPasswordIsEmpty() throws
            Exception {
        System.out.println( "\n\n" + "Testing ketiga: Inputan Password Kosong");
                when(view.getEmail()).thenReturn("cyrillusrama@gmail.com");
        System.out.println("Email : "+ view.getEmail());
        when(view.getPassword()).thenReturn("");
        System.out.println("Password : "+view.getPassword());
        presenter.onRandomClicked();
        verify(view).showPasswordError("Semester tidak boleh kosong");
    }
    @Test
    public void shouldShowErrorMessageWhenPasswordIsNotAlphaNum() throws
            Exception {
        System.out.println( "\n\n" + "Testing keempat: Inputan password tidak sesuai format");
                when(view.getEmail()).thenReturn("cyrillusrama@gmail.com");
        System.out.println("Email : "+ view.getEmail());
        when(view.getPassword()).thenReturn("Admin");
        System.out.println("Password : "+view.getPassword());
        presenter.onRandomClicked();
        verify(view).showPasswordError("Format Password harus lebih dari 6");
    }
    @Test
    public void shouldShowErrorMessageWhenKotaAsalIsEmpty() throws
            Exception {
        System.out.println( "\n\n" + "Testing kelima: Inputan Kota Asal Kosong");
                when(view.getEmail()).thenReturn("cyrillusrama@gmail.com");
        System.out.println("Email : "+ view.getEmail());
        when(view.getPassword()).thenReturn("Admin123");
        System.out.println("Password : "+view.getPassword());
        when(view.getKotaAsal()).thenReturn("");
        System.out.println("Kota Asal : "+view.getKotaAsal());
        presenter.onRandomClicked();
        verify(view).showKotaAsalError("Format Kota Asal tidak boleh kosong");
    }
    @Test
    public void shouldShowErrorMessageWhenKotaAsalIsAlpha2Words() throws
            Exception {
        System.out.println( "\n\n" + "Testing keenam: Inputan Kota Asal tidak sesuai format");
        when(view.getEmail()).thenReturn("cyrillusrama@gmail.com");
        System.out.println("Email : "+ view.getEmail());
        when(view.getPassword()).thenReturn("Admin123");
        System.out.println("Password : "+view.getPassword());
        when(view.getKotaAsal()).thenReturn("mgl");
        System.out.println("Kota Asal : "+view.getKotaAsal());
        presenter.onRandomClicked();
        verify(view).showKotaAsalError("Format Kota Asal tidak boleh kosong");
    }

}