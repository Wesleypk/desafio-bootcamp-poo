package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{

    private int cargaHorari;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHorari;
    }

    public Curso() {
    }


    public int getCargaHoraria() {
        return cargaHorari;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHorari = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHorari +
                '}';
    }
}