package com.example.demo;


import com.example.demo.model.Doctor;
import com.example.demo.repository.DoctorRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class DoctorServiceTest {

    @Mock
    DoctorRepository doctorRepo;

    @Test
    void getDoctorById() throws Exception{

    }
}



