package defaultPackage;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
/**
 * �T�[�u���b�g
 * HTML��������󂯎��A�\�������鏈��
 *
 * ��@�E�A�̉񓚂����肢���܂��B
 *
 */
public class SelectServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        request.setCharacterEncoding("UTF-8");
        // ��@ select.html����n���ꂽ�l���󂯎�邽�߂ɉ��L���C�����܂��傤�B
        String value = request.getParameter("month");
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        // ��A �G�r�f���X�Ɠ����\���ɂȂ�悤�ɏC�����܂��傤�B
        out.println("����"+value+"���ł��B");
    }
}