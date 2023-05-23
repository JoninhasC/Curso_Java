/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author jonin
 */
public class Comentarista {
    private Integer idComentarista;
    private String nome;
    private String nickName;

    public Comentarista(Integer idComentarista, String nome, String nickName) {
        this.idComentarista = idComentarista;
        this.nome = nome;
        this.nickName = nickName;
    }

    public Integer getIdComentarista() {
        return idComentarista;
    }

    public void setIdComentarista(Integer idComentarista) {
        this.idComentarista = idComentarista;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "Comentarista{" + "idComentarista=" + idComentarista + ", nome=" + nome + ", nickName=" + nickName + '}';
    }
    
}
