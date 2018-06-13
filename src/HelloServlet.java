import org.apache.commons.fileupload.disk.DiskFileItemFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {

    public HelloServlet() {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        System.out.println("处理 get() 請求。。。");
        PrintWriter out = resp.getWriter();
        out.print("hello servlet");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
        System.out.println("处理 post() 請求。。。");
        PrintWriter out = resp.getWriter();
        out.print("hello servlet");
        //获得磁盘文件条目工厂
        DiskFileItemFactory factory = new DiskFileItemFactory();
        out.print("hello servlet");
        String str = request.getSession().getServletContext().getRealPath("");
        //获取文件需要上传到的路径

        String path = this.getServletContext().getRealPath("/upload");
        String pathStr=null;
        System.out.println("上传的图片路径:" + path);
    }
}
