
////public class RetryCommand<T> {
//
//    private int maxRetries;
//
//    RetryCommand(int maxRetries)
//    {
//        this.maxRetries = maxRetries;
//    }
//
//    // Takes a function and executes it, if fails, passes the function to the retry command
//    public T run(Supplier<T> function) {
//        try {
//            return function.get();
//        } catch (Exception e) {
//            log.error("FAILED - Command failed, will be retried " + maxRetries + " times.");
//            return retry(function);
//        }
//    }
//
//    private T retry(Supplier<T> function) throws RuntimeException {
//
//        int retryCounter = 0;
//        while (retryCounter < maxRetries) {
//            try {
//                return function.get();
//            } catch (Exception ex) {
//                retryCounter++;
//                log.error("FAILED - Command failed on retry " + retryCounter + " of " + maxRetries, ex);
//                if (retryCounter >= maxRetries) {
//                    log.error("Max retries exceeded.");
//                    break;
//                }
//            }
//        }
//        throw new RuntimeException("Command failed on all of " + maxRetries + " retries");
//    }
//}
import java.util.Scanner;

public class ExceptionTesting {
	public static void main(String[] args) {
		try {
			System.out.println(checkAge());
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private static int checkAge() throws Except {
		Scanner sc = new Scanner(System.in);
		int age = 0;
		int retries = 3;
		try {
			System.out.println("Enter the age");
			age = sc.nextInt();
			if (age < 18) {
				throw new Except();
			}

		} catch (Exception e) {
			retries--;
			while (retries != 0) {
				
				System.out.println("Retry : Enter the age");
				age = sc.nextInt();
				if (age < 18) {
					retries--;
				}
			}
			if (retries == 0) {
				throw new Except();
			}
		}
		return age;

	}
}