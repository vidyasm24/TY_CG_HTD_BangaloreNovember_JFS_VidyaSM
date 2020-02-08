import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DoctorNavComponent } from './doctor-nav.component';

describe('DoctorNavComponent', () => {
  let component: DoctorNavComponent;
  let fixture: ComponentFixture<DoctorNavComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DoctorNavComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DoctorNavComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
