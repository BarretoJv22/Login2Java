package pooprojeto02;

import javax.swing.JOptionPane;

public class Joao {

    private String nome; //= "João Victor";
    private String curso; //= "Ciência da computação"
    private String ra; //= "822138704";
    private String email; //= "joao@outlook.com";

    public Joao(String nome) {
        this.nome = nome;
    }

    public void informacoesJoao() {
    
    curso = "Ciência da computação";
     ra = "822138704";
    email = "joao@outlook.com";

    if (getNome().equals("João Victor")){
      
        JOptionPane.showMessageDialog(null, "nome: " + nome + "\n" + "curso: " + curso + "\n" + "ra: " + ra + "\n" + "email: " + email + "\n");
    }else{
        JOptionPane.showMessageDialog(null, "F no chat");
    }
    }
    

   
    public String getNome() {
        return nome;
    }

 
    public void setNome(String nome) {
        this.nome = nome;
    }

   
    public String getCurso() {
        return curso;
    }

    
    public void setCurso(String curso) {
        this.curso = curso;
    }

    
    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    
    public String getEmail() {
        return email;
    }

    
    public void setEmail(String email) {
        this.email = email;
    }

}
