/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediatheque;

/**
 *
 * @author mmalherb
 */
public class VisitorBook implements Visitor{
    @Override
    public void visit(Book b){
        System.out.println("visite "+b);
    }

    @Override
    public void visit(CD c) {
       
    }
}
