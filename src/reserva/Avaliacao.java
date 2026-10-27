package src.reserva;

public class Avaliacao{

        private String autor;
        private double nota;
        private String comentario;

        public Avaliacao(String autor, double nota, String comentario) {
            this.autor = autor;
            this.nota = nota;
            this.comentario = comentario;
        }

        public String getAutor() {
            return autor;
        }

        public double getNota() {
            return nota;
        }

        public String getComentario() {
            return comentario;
        }

        public void setAutor(String autor) {
            this.autor = autor;
        }

        public void setNota(double nota) {
            this.nota = nota;
        }

        public void setComentario(String comentario) {
            this.comentario = comentario;
        }
}
