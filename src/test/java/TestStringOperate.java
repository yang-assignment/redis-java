import org.junit.Test;
import redis.clients.jedis.Jedis;

public class TestStringOperate {
    private static Jedis jedis = new Jedis("192.168.81.140", 6379);

    public static void main(String[] args) {
        System.out.println("服务启动..." + jedis.ping());
    }

    @Test
    public void getsetTest() {
        String oldValue = jedis.getSet("brand1", "itcast");
        System.out.println(oldValue);
    }
    @Test
    public void strlenTest() {
        Long valueLen = jedis.strlen("brand6");
        System.out.println(valueLen);
    }
    @Test
    public void getrangeTest() {
        String value = jedis.getrange("brand6", 4, 7);
        System.out.println(value);
    }
    @Test
    public void appendTest() {
        Long len = jedis.append("brand1", "heima");
        System.out.println(len);
    }
}
