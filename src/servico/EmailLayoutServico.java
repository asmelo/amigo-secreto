package servico;

import dominio.Pessoa;

public class EmailLayoutServico {

    public String getBody(Pessoa pessoa, String tituloDoSorteio) {
        return "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n" +
                "<html xmlns=\"http://www.w3.org/1999/xhtml\">\n" +
                " \n" +
                "<head>\n" +
                "  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n" +
                "  <title>" + tituloDoSorteio + "</title>\n" +
                "  <style type=\"text/css\">\n" +
                "  body {margin: 0; padding: 0; min-width: 100%!important;}\n" +
                "  img {height: auto;}\n" +
                "  .content {width: 100%; max-width: 600px;}\n" +
                "  .header {padding: 40px 30px 20px 30px;}\n" +
                "  .innerpadding {padding: 30px 30px 30px 30px;}\n" +
                "  .borderbottom {border-bottom: 1px solid #f2eeed;}\n" +
                "  .subhead {font-size: 15px; color: #ffffff; font-family: sans-serif; letter-spacing: 10px;}\n" +
                "  .h1, .h2, .bodycopy {color: #153643; font-family: sans-serif;}\n" +
                "  .h1 {font-size: 33px; line-height: 38px; font-weight: bold;}\n" +
                "  .h2 {padding: 0 0 15px 0; font-size: 24px; line-height: 28px; font-weight: bold;}\n" +
                "  .bodycopy {font-size: 16px; line-height: 22px;}\n" +
                "  .button {text-align: center; font-size: 18px; font-family: sans-serif; font-weight: bold; padding: 0 30px 0 30px;}\n" +
                "  .button a {color: #ffffff; text-decoration: none;}\n" +
                "  .footer {padding: 20px 30px 15px 30px;}\n" +
                "  .footercopy {font-family: sans-serif; font-size: 14px; color: #ffffff;}\n" +
                "  .footercopy a {color: #ffffff; text-decoration: underline;}\n" +
                "\n" +
                "  @media only screen and (max-width: 550px), screen and (max-device-width: 550px) {\n" +
                "  body[yahoo] .hide {display: none!important;}\n" +
                "  body[yahoo] .buttonwrapper {background-color: transparent!important;}\n" +
                "  body[yahoo] .button {padding: 0px!important;}\n" +
                "  body[yahoo] .button a {background-color: #e05443; padding: 15px 15px 13px!important;}\n" +
                "  body[yahoo] .unsubscribe {display: block; margin-top: 20px; padding: 10px 50px; background: #2f3942; border-radius: 5px; text-decoration: none!important; font-weight: bold;}\n" +
                "  }\n" +
                "\n" +
                "  /*@media only screen and (min-device-width: 601px) {\n" +
                "    .content {width: 600px !important;}\n" +
                "    .col425 {width: 425px!important;}\n" +
                "    .col380 {width: 380px!important;}\n" +
                "    }*/\n" +
                "\n" +
                "  </style>\n" +
                "</head>\n" +
                "\n" +
                "<body yahoo bgcolor=\"#f6f8f1\">\n" +
                "<table width=\"100%\" bgcolor=\"#f6f8f1\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n" +
                "<tr>\n" +
                "  <td>\n" +
                "    <!--[if (gte mso 9)|(IE)]>\n" +
                "      <table width=\"600\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\n" +
                "        <tr>\n" +
                "          <td>\n" +
                "    <![endif]-->     \n" +
                "    <table bgcolor=\"#ffffff\" class=\"content\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\n" +
                "      <tr>\n" +
                "        <td bgcolor=\"#c7d8a7\" class=\"header\">\n" +
                "          <table width=\"70\" align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">  \n" +
                "            <tr>\n" +
                "              <td height=\"70\" style=\"padding: 0 20px 20px 0;\">\n" +
                "                <img class=\"fix\" src=\"https://s3-us-west-2.amazonaws.com/s.cdpn.io/210284/icon.gif\" width=\"70\" height=\"70\" border=\"0\" alt=\"\" />\n" +
                "              </td>\n" +
                "            </tr>\n" +
                "          </table>\n" +
                "          <!--[if (gte mso 9)|(IE)]>\n" +
                "            <table width=\"425\" align=\"left\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\n" +
                "              <tr>\n" +
                "                <td>\n" +
                "          <![endif]-->\n" +
                "          <table class=\"col425\" align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"width: 100%; max-width: 425px;\">  \n" +
                "            <tr>\n" +
                "              <td height=\"70\">\n" +
                "                <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n" +
                "                  <tr>\n" +
                "                    <td class=\"subhead\" style=\"padding: 0 0 0 3px;\">\n" +
                "                      \n" +
                "                    </td>\n" +
                "                  </tr>\n" +
                "                  <tr>\n" +
                "                    <td class=\"h1\" style=\"padding: 5px 0 0 0;\">\n" +
                "                      " + tituloDoSorteio + "\n" +
                "                    </td>\n" +
                "                  </tr>\n" +
                "                </table>\n" +
                "              </td>\n" +
                "            </tr>\n" +
                "          </table>\n" +
                "          <!--[if (gte mso 9)|(IE)]>\n" +
                "                </td>\n" +
                "              </tr>\n" +
                "          </table>\n" +
                "          <![endif]-->\n" +
                "        </td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td class=\"innerpadding borderbottom\">\n" +
                "          <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n" +
                "            <tr>\n" +
                "              <td class=\"h2\">\n" +
                "                Olá " + pessoa.getNome() + "!\n" +
                "              </td>\n" +
                "            </tr>\n" +
                "            <tr>\n" +
                "              <td class=\"bodycopy\">\n" +
                "                &nbsp;&nbsp;&nbsp;&nbsp;Seu amigo secreto é " + pessoa.getAmigo() + "! \n" +
                "              </td>\n" +
                "            </tr>\n" +
                "          </table>\n" +
                "        </td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td class=\"innerpadding borderbottom\">\n" +
                "          <table width=\"115\" align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">  \n" +
                "            <tr>\n" +
                "              <td height=\"115\" style=\"padding: 0 20px 20px 0;\">\n" +
                "                <img class=\"fix\" src=\"https://images.emojiterra.com/google/android-pie/512px/1f917.png\" width=\"40\" height=\"40\" border=\"0\" alt=\"\" />\n" +
                "              </td>\n" +
                "            </tr>\n" +
                "          </table>\n" +
                "          <!--[if (gte mso 9)|(IE)]>\n" +
                "            <table width=\"380\" align=\"left\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\n" +
                "              <tr>\n" +
                "                <td>\n" +
                "          <![endif]-->\n" +
                "          <table class=\"col380\" align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"width: 100%; max-width: 380px;\">  \n" +
                "            <tr>\n" +
                "              <td>\n" +
                "                <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n" +
                "                  <tr>\n" +
                "                    <td class=\"h2\">\n<br>" +
                "                      Boas Festas!\n" +
                "                    </td>\n" +
                "                  </tr>\n" +
                "                  <tr>\n" +
                "                    <td style=\"padding: 20px 0 0 0;\">\n" +
                "                      <table class=\"buttonwrapper\" bgcolor=\"#e05443\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">";

    }

}
