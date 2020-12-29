import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {environment} from '../../environments/environment';
import {Observable} from 'rxjs';
import {SystemHealth} from '../interfaces/SystemHealth.model';
import {SystemCpu} from '../interfaces/SystemCpu.model';

@Injectable({
  providedIn: 'root'
})
export class AdminDashboardService {
  private SERVER_URL = environment.serverUrl;

  constructor(private http: HttpClient) { }

  public getHttpTraces(): Observable<any> {
    return this.http.get(`${this.SERVER_URL}/httptrace`);
  }
  public getSystemHealth(): Observable<SystemHealth> {
    return this.http.get<SystemHealth>(`${this.SERVER_URL}/health`);
  }
  public getSystemCpu(): Observable<SystemCpu> {
    return this.http.get<SystemCpu>(`${this.SERVER_URL}/metrics/system.cpu.count`);
  }
  public getProcessUptime(): Observable<any> {
    return this.http.get(`${this.SERVER_URL}/metrics/process.uptime`);
  }
}
