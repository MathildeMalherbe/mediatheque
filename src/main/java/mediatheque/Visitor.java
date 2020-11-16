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
public interface Visitor {

    public void visit(Book b);
    public void visit(CD c);
}
