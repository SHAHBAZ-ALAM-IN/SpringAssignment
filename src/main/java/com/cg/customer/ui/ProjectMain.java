package com.cg.customer.ui;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.customer.JavaConfiguration;
import com.cg.customer.exceptions.InvalidArgumentException;
import com.cg.customer.exceptions.InvalidCustomerNameException;

public class ProjectMain {

    public static void main(String args[]) {
        try {
            AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
            context.register(JavaConfiguration.class);
            context.refresh();
            ProjectUi projectUi = context.getBean(ProjectUi.class);
            projectUi.runUi();

        } catch (InvalidArgumentException e) {
            System.out.println(e.getMessage());
        } catch (InvalidCustomerNameException e) {
            System.out.println(e.getMessage());
        }  catch (Exception e) {
            System.out.println("something went wrong");
        }

    }

}