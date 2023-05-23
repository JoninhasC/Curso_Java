/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author jonin
 */
public class Jogador extends EstatisticaGeral{
    private Integer idJogador;
    private String nome;
    private String nickName;
    private Time time;

    public Jogador(Integer idJogador, String nome, String nickName, Time time, Integer idEstatisticaGeral, double mediaKill, double mediaMorte, double mediaAssists, int totalKill, int totalMorte, int totalAssists, int totalPartidaJogador, Integer idEstaticaparida, int numeroKill, int numeroMortes, int numeroAssists, double KdRatio) {
        super(idEstatisticaGeral, mediaKill, mediaMorte, mediaAssists, totalKill, totalMorte, totalAssists, totalPartidaJogador, idEstaticaparida, numeroKill, numeroMortes, numeroAssists, KdRatio);
        this.idJogador = idJogador;
        this.nome = nome;
        this.nickName = nickName;
        this.time = time;
    }


    public Integer getIdJogador() {
        return idJogador;
    }

    public void setIdJogador(Integer idJogador) {
        this.idJogador = idJogador;
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

    @Override
    public String toString() {
        return "Jogador{" + "idJogador=" + idJogador + ", nome=" + nome + ", nickName=" + nickName + ", time=" + time + '}';
    }
    
}
