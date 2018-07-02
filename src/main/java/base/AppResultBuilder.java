package base;

public class AppResultBuilder {

	public static <T> AppResult<T> buildSuccessResult(String code) {
		return buildSuccessResult(null, code, 1);
	}

	public static <T> AppResult<T> buildSuccessResult(T t, String code) {
		return buildSuccessResult(t, code, 1);
	}

	public static <T> AppResult<T> buildSuccessResult(T t, String code,
			long count) {
		AppResult<T> result = new AppResult<T>();
		result.setTotal(count);
		result.setCode(code);
		result.setData(t);
		result.setStatus(true);
		return result;
	}

	public static <T> AppResult<T> buildFailedResult(T t, String code) {
		return buildFailedResult(t, code, 0);
	}

	public static <T> AppResult<T> buildFailedResult(String code) {
		return buildFailedResult(null, code, 0);
	}

	public static <T> AppResult<T> buildFailedResult(String code, int count) {
		return buildFailedResult(null, code, count);
	}

	public static <T> AppResult<T> buildFailedResult(T t, String code, int count) {
		AppResult<T> result = new AppResult<T>();
		result.setTotal(count);
		result.setCode(code);
		result.setData(t);
		return result;
	}

	public static <T> AppResult<T> buildSuccessMessageResult(String message) {
		return buildSuccessMessageResult(null, message, 1);
	}

	public static <T> AppResult<T> buildSuccessMessageResult(T t, String message) {
		return buildSuccessMessageResult(t, message, 1);
	}

	public static <T> AppResult<T> buildSuccessMessageResult(T t,
			String message, long count) {
		AppResult<T> result = new AppResult<T>();
		result.setTotal(count);
		result.setMessage(message);
		result.setData(t);
		result.setStatus(true);
		return result;
	}

	public static <T> AppResult<T> buildFailedMessageResult(String message) {
		return buildFailedMessageResult(null, message, 0);
	}

	public static <T> AppResult<T> buildFailedMessageResult(T t, String message) {
		return buildFailedMessageResult(t, message, 0);
	}

	public static <T> AppResult<T> buildFailedMessageResult(String message,
			int count) {

		return buildFailedMessageResult(null, message, count);
	}

	public static <T> AppResult<T> buildFailedMessageResult(T t,
			String message, int count) {
		AppResult<T> result = new AppResult<T>();
		result.setTotal(count);
		result.setMessage(message);
		result.setData(t);
		return result;
	}

}
