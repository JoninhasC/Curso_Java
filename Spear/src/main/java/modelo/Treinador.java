/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author jonin
 */
public class Treinador   {

    private Integer idTreinador;
    private String nome;
    private String nickName;
    private Time time;

    @Override
    public String toString() {
        return "Treinador{" + "idTreinador=" + idTreinador + ", nome=" + nome + ", nickName=" + nickName + ", time=" + time + '}';
    }

    public Integer getIdTreinador() {
        return idTreinador;
    }

    public void setIdTreinador(Integer idTreinador) {
        this.idTreinador = idTreinador;
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

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Treinador(Integer idTreinador, String nome, String nickName, Time time) {
        this.idTreinador = idTreinador;
        this.nome = nome;
        this.nickName = nickName;
        this.time = time;
    }
;

}
