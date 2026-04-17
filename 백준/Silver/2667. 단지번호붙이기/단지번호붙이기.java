import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main{
	
    static int N;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int count; // 전역 변수로 집 개수 세기

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        visited = new boolean[N][N];
        
        for(int i = 0; i < N; i++) {
            String line = br.readLine();
            for(int j = 0; j < N; j++) {
                map[i][j] = line.charAt(j) - '0';
            }
        }
        br.close();
        
       // PriorityQueue (자동 오름차순 정렬)
        PriorityQueue<Integer> que = new PriorityQueue<>();
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) { // 수정 1: j < j 를 j < N 으로 수정
                if(map[i][j] == 1 && !visited[i][j]) {
                    count = 0;        // 수정 2: 새로운 단지 발견! 카운트 0으로 리셋
                    dfs(i, j);        // 수정 3: dfs 탐색 시작 (전염병 퍼뜨리기)
                    que.offer(count); // 탐색 끝! 모인 집 개수를 우선순위 큐에 넣기
                }
            }
        }
        
        System.out.println(que.size()); // 총 단지 수 출력
        
        while(!que.isEmpty()) {
            System.out.println(que.poll()); // 작은 수부터 차례대로 출력!
        }
    } // main 
			
    public static void dfs(int x, int y) {
        visited[x][y] = true; // 현재 위치 방문 체크
        count++;              // 집 개수 1 증가
        
        // 상하좌우 4방향을 찔러봅니다
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i]; // next X
            int ny = y + dy[i]; // next Y
            
            // 다음 위치가 지도 밖으로 벗어나지 않았는지 확인
            if (nx >= 0 && ny >= 0 && nx < N && ny < N) {
                // 다음 위치에 집이 있고('1'), 아직 방문하지 않은 곳이라면?
                if (map[nx][ny] == 1 && !visited[nx][ny]) {
                    dfs(nx, ny); // 그 위치로 이동해서 다시 탐색 (재귀 호출!)
                }
            }
        }
    }
}