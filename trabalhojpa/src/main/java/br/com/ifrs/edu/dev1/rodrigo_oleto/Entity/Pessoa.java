package br.com.ifrs.edu.dev1.rodrigo_oleto.Entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;




@Entity
public class Pessoa implements Serializable{
    private static final long serialVersionUID = 1L;
   

    @Id    @GeneratedValue(strategy=GenerationType.IDENTITY) 
 private Integer id=0;
private String nome;
private String email;
public String getEmail() {
    return email;
}public Integer getId() {
    return id;
}public String getNome() {
    return nome;
}public void setEmail(String email) {
    this.email = email;
}public void setId(Integer id) {
    this.id = id;
}public void setNome(String nome) {
    this.nome = nome;
}
public Pessoa( Integer id,String nome, String email){
    super();
    this.id=id;
    this.nome=nome;
    this.email=email;
}
@Override
public String toString(){
    return "pessoa(id:"+id+",nome:"+nome+",email:"+email+")";

}
    
}
