package base;


/**
 * 接口数据实体类
 * 
 *
 * 
 * @param <T>
 */

public class AppResult<T> {

	private boolean status;// 是否成功

	private String message;// 消息

	private String code;// 消息字段

	private T data;// 数据

	private long total;// 数量

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}


}
