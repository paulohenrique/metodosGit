package br.com.starcode.testemaven01;

import org.apache.commons.lang3.StringEscapeUtils;

public class SuperUtil {

    /**
     * Possibilita exibir um texto contendo HTML no navegador sem ataques XSS.
     * @param html Entrada do usu�rio (pode ter HTML, mas n�o deve ser renderizado, somente exibido)
     * @return Texto sem pos�veis tags HTML
     */
    public static String escapeHTML(String html) {
        return StringEscapeUtils.escapeHtml4(html);
    }

}