import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MenuNGComponent } from './menu-ng.component';

describe('MenuNGComponent', () => {
  let component: MenuNGComponent;
  let fixture: ComponentFixture<MenuNGComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MenuNGComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MenuNGComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
