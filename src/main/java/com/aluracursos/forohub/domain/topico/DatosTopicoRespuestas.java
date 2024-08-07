package com.aluracursos.forohub.domain.topico;

import com.aluracursos.forohub.domain.topico.respuesta.DatosRespuesta;
import org.springframework.data.domain.Page;

public record DatosTopicoRespuestas(DatosTopico topico, Page<DatosRespuesta> respuestas) {
}
